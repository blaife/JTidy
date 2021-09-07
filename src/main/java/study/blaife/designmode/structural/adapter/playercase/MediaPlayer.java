package study.blaife.designmode.structural.adapter.playercase;

/**
 * @Description: 媒体内容
 * @Author: magd39318
 * @Date: 2021/8/30 10:53
 */
public interface MediaPlayer {
    /**
     * 播放
     * @param audioType 文件内容
     * @param fileName 文件名称
     */
    public void play(String audioType, String fileName);
}
