package cn.yuan.test.structure.facade;

/**
 * 外观
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-25 11:34:48
 */
public class HomeTheaterFacade {
    private CdPlayer cdPlayer;
    private Amplifier amplifier;
    private Speakers speakers;

    public HomeTheaterFacade(CdPlayer cdPlayer, Amplifier amplifier, Speakers speakers) {
        this.cdPlayer = cdPlayer;
        this.amplifier = amplifier;
        this.speakers = speakers;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie ...");
        cdPlayer.on();
        amplifier.on();
        speakers.on();
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down ...");
        cdPlayer.off();
        amplifier.off();
        speakers.off();
    }
}
