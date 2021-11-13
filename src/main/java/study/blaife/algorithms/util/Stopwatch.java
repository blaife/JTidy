package study.blaife.algorithms.util;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Description: 程序计时器  抄自 Spring
 * @Author: blaife
 * @Date: 2021/10/26 19:56
 */
public final class Stopwatch {

    /**
     * 类唯一 id 可手动指定，也可以为空
     */
    private final String id;

    /**
     * 是否保存其任务列表
     * 存在id参数的构造方法设置为true，也可以使用set方法设置
     */
    private boolean keepTaskList;

    /**
     * 任务列表
     */
    private final List<TaskInfo> taskList;

    /**
     * 任务执行开始时间
     */
    private long startTimeNanos;

    /**
     * 当前任务名称
     */
    private String currentTaskName;

    /**
     * 最后一次执行的任务对象
     */
    private Stopwatch.TaskInfo lastTaskInfo;

    /**
     * 任务总数
     */
    private int taskCount;

    /**
     * 所有任务执行总数
     */
    private long totalTimeNanos;

    public Stopwatch() {
        this("");
    }

    public Stopwatch(String id) {
        this.keepTaskList = true;
        this.taskList = new ArrayList(1);
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setKeepTaskList(boolean keepTaskList) {
        this.keepTaskList = keepTaskList;
    }

    public void start() throws IllegalStateException {
        this.start("");
    }

    /**
     * 启动方法
     *
     * 只允许存在一个任务，若重复启动会抛出异常，提醒任务已经在运行中
     * 若此时不存在任务，则设置任务名称，并设置任务启动时间为当前时间（System.nanoTime() 此方法以纳秒为单位）
     *
     * 注意：任务启动名称可以为空字符串
     *
     * @param taskName
     * @throws IllegalStateException
     */
    public void start(String taskName) throws IllegalStateException {
        if (this.currentTaskName != null) {
            throw new IllegalStateException("Can't start StopWatch: it's already running");
        } else {
            this.currentTaskName = taskName;
            this.startTimeNanos = System.nanoTime();
        }
    }

    /**
     * 停止任务
     *
     * 必须存在一个任务，若当前任务不存在，提醒无运行中的任务
     * 若正常执行，则设置最近执行时常（lastTime）为当前时间 - 启动时间
     * 累加其总运行时间，并根据是否保存任务列表参数处理当前任务对象
     * 添加任务总数，设置当前任务名称为 null
     *
     *
     * @throws IllegalStateException
     */
    public void stop() throws IllegalStateException {
        if (this.currentTaskName == null) {
            throw new IllegalStateException("Can't stop StopWatch: it's not running");
        } else {
            long lastTime = System.nanoTime() - this.startTimeNanos;
            this.totalTimeNanos += lastTime;
            this.lastTaskInfo = new Stopwatch.TaskInfo(this.currentTaskName, lastTime);
            if (this.keepTaskList) {
                this.taskList.add(this.lastTaskInfo);
            }

            ++this.taskCount;
            this.currentTaskName = null;
        }
    }

    public boolean isRunning() {
        return this.currentTaskName != null;
    }

    public String currentTaskName() {
        return this.currentTaskName;
    }

    public long getLastTaskTimeNanos() throws IllegalStateException {
        if (this.lastTaskInfo == null) {
            throw new IllegalStateException("No tasks run: can't get last task interval");
        } else {
            return this.lastTaskInfo.getTimeNanos();
        }
    }

    public long getLastTaskTimeMillis() throws IllegalStateException {
        if (this.lastTaskInfo == null) {
            throw new IllegalStateException("No tasks run: can't get last task interval");
        } else {
            return this.lastTaskInfo.getTimeMillis();
        }
    }

    public String getLastTaskName() throws IllegalStateException {
        if (this.lastTaskInfo == null) {
            throw new IllegalStateException("No tasks run: can't get last task name");
        } else {
            return this.lastTaskInfo.getTaskName();
        }
    }

    public Stopwatch.TaskInfo getLastTaskInfo() throws IllegalStateException {
        if (this.lastTaskInfo == null) {
            throw new IllegalStateException("No tasks run: can't get last task info");
        } else {
            return this.lastTaskInfo;
        }
    }

    public long getTotalTimeNanos() {
        return this.totalTimeNanos;
    }

    public long getTotalTimeMillis() {
        return nanosToMillis(this.totalTimeNanos);
    }

    public double getTotalTimeSeconds() {
        return nanosToSeconds(this.totalTimeNanos);
    }

    public int getTaskCount() {
        return this.taskCount;
    }

    public Stopwatch.TaskInfo[] getTaskInfo() {
        if (!this.keepTaskList) {
            throw new UnsupportedOperationException("Task info is not being kept!");
        } else {
            return (Stopwatch.TaskInfo[])this.taskList.toArray(new Stopwatch.TaskInfo[0]);
        }
    }

    /**
     * 简单的总结
     * @return
     */
    public String shortSummary() {
        return "StopWatch '" + this.getId() + "': running time = " + this.getTotalTimeNanos() + " ns";
    }

    /**
     * 排版输出
     * @return
     */
    public String prettyPrint() {
        StringBuilder sb = new StringBuilder(this.shortSummary());
        sb.append('\n');
        if (!this.keepTaskList) {
            sb.append("No task info kept");
        } else {
            sb.append("---------------------------------------------\n");
            sb.append("ns         %     Task name\n");
            sb.append("---------------------------------------------\n");
            NumberFormat nf = NumberFormat.getNumberInstance();
            nf.setMinimumIntegerDigits(9);
            nf.setGroupingUsed(false);
            NumberFormat pf = NumberFormat.getPercentInstance();
            pf.setMinimumIntegerDigits(3);
            pf.setGroupingUsed(false);
            Stopwatch.TaskInfo[] var4 = this.getTaskInfo();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                Stopwatch.TaskInfo task = var4[var6];
                sb.append(nf.format(task.getTimeNanos())).append("  ");
                sb.append(pf.format((double)task.getTimeNanos() / (double)this.getTotalTimeNanos())).append("  ");
                sb.append(task.getTaskName()).append('\n');
            }
        }

        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.shortSummary());
        if (this.keepTaskList) {
            Stopwatch.TaskInfo[] var2 = this.getTaskInfo();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                Stopwatch.TaskInfo task = var2[var4];
                sb.append("; [").append(task.getTaskName()).append("] took ").append(task.getTimeNanos()).append(" ns");
                long percent = Math.round(100.0D * (double)task.getTimeNanos() / (double)this.getTotalTimeNanos());
                sb.append(" = ").append(percent).append('%');
            }
        } else {
            sb.append("; no task info kept");
        }

        return sb.toString();
    }

    /**
     * 毫秒
     * @param duration
     * @return
     */
    private static long nanosToMillis(long duration) {
        return TimeUnit.NANOSECONDS.toMillis(duration);
    }

    /**
     * 秒
     * @param duration
     * @return
     */
    private static double nanosToSeconds(long duration) {
        return (double)duration / 1.0E9D;
    }

    /**
     * 运行任务对象
     * 任务名称，任务执行时长
     */
    public static final class TaskInfo {
        private final String taskName;
        private final long timeNanos;

        TaskInfo(String taskName, long timeNanos) {
            this.taskName = taskName;
            this.timeNanos = timeNanos;
        }

        public String getTaskName() {
            return this.taskName;
        }

        public long getTimeNanos() {
            return this.timeNanos;
        }

        public long getTimeMillis() {
            return Stopwatch.nanosToMillis(this.timeNanos);
        }

        public double getTimeSeconds() {
            return Stopwatch.nanosToSeconds(this.timeNanos);
        }
    }
}