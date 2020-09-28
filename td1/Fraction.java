public class Fraction

{
    public static void(String[] args)
    {
        private int x;
        private int y;
        private double resultat;

        public Fraction(int x,int y)
        {
            this.x=x;
            this.y=y;
            this.resultat=(double)x/y;
        }

        public int getX()
        {
            return x;
        }

        public int getY()
        {
            return y;
        }

        public double getResultat()
        {
            return resultat;
        }

        @Override
        public String toString()
        {
            String s=x+" / "+y+" = "+resultat;
            return s;
        }


}
