package study.blaife.designmode.structural.adapter.playercase;

/**
 * @Description: 媒体适配器
 * @Author: magd39318
 * @Date: 2021/8/30 10:58
 */
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase(Constant.VLC_TYPE)) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase(Constant.MP4_TYPE)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase(Constant.VLC_TYPE)) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase(Constant.MP4_TYPE)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
