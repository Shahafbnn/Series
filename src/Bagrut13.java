public class Bagrut13 {

    public class SportArea
    {      private String name;	// שם הענף
        private String topType;	// סוג תוצאה טובה ביותר      (max / min(
        private double worldRecord;	// שיא עולמי
        private String bestSportman;	// שם הספורטאי שמחזיק בשיא

        public SportArea(String name, String topType, double worldRecord, String bestSportman) {
            this.name = name;
            this.topType = topType;
            this.worldRecord = worldRecord;
            this.bestSportman = bestSportman;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getTopType() {
            return topType;
        }
        public void setTopType(String topType) {
            this.topType = topType;
        }
        public double getWorldRecord() {
            return worldRecord;
        }
        public void setWorldRecord(double worldRecord) {
            this.worldRecord = worldRecord;
        }
        public String getBestSportman() {
            return bestSportman;
        }
        public void setBestSportman(String bestSportman) {
            this.bestSportman = bestSportman;
        }

        //א – הוסיפו למחלקה פעולה בשם: setRecord . הפעולה תקבל שם ספורטאי ותוצאה שהשיג. על הפעולה לבדוק האם נקבע שיא עולמי חדש, ואם כן לעדכן את המחלקה בהתאם.
        public void setRecord(String name, double score){
            if(score>worldRecord && !name.equals(bestSportman)) {
                worldRecord = score;
                bestSportman = name;
            }
        }
    }

    //ב – הגדירו פעולה חיצונית המקבלת מערך של ענפי ספורט.
    // על הפעולה להדפיס את שמות הענפים שהשיא העולמי שלהם הוא מתחת ל-10 שנ' וסוג התוצאה הטובה ביותר הוא min.
    //הניחו שהוגדרו במחלקה פעולות get לכל התכונות.
    public void allSportAreas(SportArea[] arr){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i].getWorldRecord() < 10 && arr[i].getTopType().equals("min")){
                System.out.println(arr[i].getName());
            }
        }
    }

}// Bagrut13 bracket
