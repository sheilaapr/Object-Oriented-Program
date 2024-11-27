package Pertemuan_6;
//piano, biola, gitar, drum, saxophone, dan trumpet.

class AlatMusik {
    public void cara() {
        System.out.println("Cara memainkan alat musik");
    }
}

 class Piano extends AlatMusik {
     @Override
     public void cara() {
         System.out.println(" Piano dimainkan dengan cara\t\t: ditekan");
     }
 }

class Biola extends AlatMusik {
    @Override
    public void cara() {
        System.out.println(" Biola dimainkan dengan cara\t\t: digesek");
    }
}

class Gitar extends AlatMusik {
    @Override
    public void cara() {
        System.out.println(" Gitar dimainkan dengan cara\t\t: dipetik");
    }
}

class Drum extends AlatMusik {
    @Override
    public void cara() {
        System.out.println(" Drum dimainkan dengan cara\t\t: dipukul");
    }
}

class Saxophone extends AlatMusik {
    @Override
    public void cara() {
        System.out.println(" Saxophone dimainkan dengan cara\t: ditiup");
    }
}

class Terompet extends AlatMusik {
       @Override
       public void cara() {
        System.out.println(" Terompet dimainkan dengan cara\t\t: ditiup dengan dengung");
       }
}

class CaraMain {
    public static void main(String[] args) {
        Piano p = new Piano();
        p.cara();
        
        Biola b = new Biola();
        b.cara();
        
        Gitar g = new Gitar();
        g.cara();
        
        Drum d = new Drum();
        d.cara();
        
        Saxophone s = new Saxophone();
        s.cara();
        
        Terompet t = new Terompet();
        t.cara();
    }
}