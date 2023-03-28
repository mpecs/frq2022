public class frq2022{

    //a)
    //returns score earned in the most recent game
    //each game consists of 3 levels, 
    //use isBonus, goalReached, getPoints methods
    //
    
    //QUESTION 1

    public int getScore(){
        int score = 0;

        if(levelOne.goalReached() == true){
            score = score + levelOne.getPoints();

            if(levelTwo.goalReached() == true){
                score = score + levelTwo.getPoints();


                if(levelThree.goalReached() == true){
                    score = score + levelThree.getPoints()
                }
            }

        }

        if(game.isBonus == true){
            score = score * 3;
        }

        return score;
    }

    //simluates the play of num games, returns highest score earned
    //use play method, getScore method, 
    public int playManyTimes(int num){
        int n = num;
        int highestScore = 0;
        int currentScore = 0;

        for(int i = 0; i <= n; i++){
            play();
            currentScore = game.getScore();

            if(currentScore > highestScore){
                highestScore = currentScore;
            }
        }

        return highestScore;
        
        
        //QUESTION 2

        public class Textbook extends Book{

            private int edition;

            public Textbook (String bookTitle, double bookPrice, int bookEdition){
                this.title = booktitle;
                this.price = bookPrice;
                this.edition = bookEdition;

            }

            public String getEdition(){
                return bookEdition;
            }

            public String getBookInfo(){
                return super.getBookInfo() + "-" + edition;
            }

            public boolean canSubstituteFor(Textbook other){
                return other.getTitle().equals(getTitle()) && edition >= other.getEdition();

            }
            
            
            //QUESTION 3

            public class reviewAnalysis{

                public double getAverageRating(){

                    int sum = 0;

                    for (Review r : allReviews){
                        sum += r.getRating;
                    }

                    return (double) sum / allRevievs.length;
                }

                public ArrayList<String> collectComments(){

                    ArrayList<String> commentList = new ArrayList.String>();

                    for(int i = 0; i < allReviews.length; i++){

                        String comment = allReviews[i].getComment();
                        if(comment.indexOf("!") >= 0){
                            String last = comment.substring(comment.length() - 1);

                        if (!last.equals("!") && !last.equals("!")){
                            comment += ".";
                        }
                        commentList.add(i + "-" + comment);
                        }
                    }
                    return commentList;
                }
                
                
                //QUESTION 4

                public void repopulate(){
                    for(int row = 0; row < grid.length; row++){
                        for  (int col = 0; col < grid[0].length; col++){
                            int rval = (int) (Math.random() * MAX) + 1;
                            while (rval % 10 !=0 || rval % 100 == 0){
                                rval = (int) (Math.random() * MAX) + 1;
                            }
                            grid[row][col] = rval;
                        }
                    }
                }

                public int countIncreasingCols(){
                    int count = 0;

                    for (int col = 0; col < grid[0].length; col++){
                        boolean ordered = true;
                        for (int row = 1; row < grid.length; row++){
                            if (grid[row][col] < grid [row-1][col]){
                                ordered = false;
                            }
                        }

                        if(ordered){
                            count ++;
                        }
                    }

                    return count;
                }



            }

        }

    }


}
