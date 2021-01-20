package Place;
public enum  Placetype {
        Cave("Пещера",3, false, false),
        Grot("Грот",2,false,false),
        SurfaceofMoon("Поверхность Луны",4,false,true),
        Tunnel("Туннель",1,true,false);
        private final String name;
        private final int hight;
        private final boolean lowpressure;
        private final boolean exit;
        Placetype (String name,int hight,boolean lowpressure, boolean exit){
            this.name=name;
            this.hight=hight;
            this.lowpressure=lowpressure;
            this.exit=exit;
        }

    public String getName() {
        return name;
    }

    public int getHight() {
        return hight;
    }

    public boolean isLowpressure() {
        return lowpressure;
    }

    public boolean isExit() {
        return exit;
    }
}
