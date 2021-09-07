package study.blaife.designmode.structural.adapter.playercase;

/**
 * @Description: mp4 播放器
 * @Author: magd39318
 * @Date: 2021/8/30 10:57
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. name: " + fileName);
    }
}
