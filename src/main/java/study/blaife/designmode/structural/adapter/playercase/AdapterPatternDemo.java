package study.blaife.designmode.structural.adapter.playercase;

/**
 * @Description: 播放器案例启动类
 *
 *      适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 *      相当于在在不支持的调用中添加了一层处理
 *
 *                                 |--------------------------|
 *  |———————————————————————|      |          播放器媒体        |
 *  |    先进的播放器媒体      |      |          /       \       |
 *  |   ↙            ↘      |      |         ↙         ↘      |
 *  | Vlc            MP4    | <------ 媒体适配器 <---- 音频播放器 <---------- 调用程序
 *  |-——————————————————————|      |——————————————————————————|
 *
 * @Author: magd39318
 * @Date: 2021/8/30 11:09
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer= new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

    }
}
