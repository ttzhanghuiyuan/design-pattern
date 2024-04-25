package cn.yuan.test.structure.facade;

public class Test {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new CdPlayer(), new Amplifier(), new Speakers());

        homeTheaterFacade.watchMovie();
        System.out.println("------------------------");
        homeTheaterFacade.endMovie();
    }
}
