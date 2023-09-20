//Build an interface MusicPlayer with methods play() and stop(). Implement classes MP3Player 
//and CDPlayer that implement the MusicPlayer interface. Override the methods to simulate
// playing and stopping.

interface MusicPlayer {
    void play();

    void stop();
}

class MP3player implements MusicPlayer {
    public void play() {
        System.out.println(" CD PLAYER IS STARTING ");
        System.out.println(" ");
        System.out.println(" MAKE THE MUSIC PLAY NOW ");
        System.out.println(" ");
    }

    public void stop() {
        System.out.println(" ");
        System.out.println(" MAKE THE MUSIC STOP NOW ");
        System.out.println(" ");
    }
}

class CDplayer implements MusicPlayer {
    public void play() {
        System.out.println(" CD PLAYER IS STARTING ");
        System.out.println(" ");
        System.out.println(" MAKE THE MUSIC PLAY NOW ");
        System.out.println(" ");
    }

    public void stop() {

        System.out.println(" ");
        System.out.println(" MAKE THE MUSIC STOP NOW ");
        System.out.println(" ");
    }
}

class music {
    public static void main(String[] args) {
        MusicPlayer a1 = new MP3player();
        a1.play();
        a1.stop();
        MusicPlayer a2 = new CDplayer();
        a2.play();
        a2.stop();
    }
}