class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean fact = true;
        for(int j=0;j<9;j++){
            Set<Character> numbers = new HashSet<>();
            for(int i=0;i<9; i++){
                char cell = board[i][j];
                if(numbers.contains(cell)){
                    return false;
                }
                else if(cell=='.') continue;
                numbers.add(cell);
            }
        }

        for(int i=0;i<9;i++){
            Set<Character> numbers = new HashSet<>();
            for(int j=0;j<9; j++){
                char cell = board[i][j];
                if(numbers.contains(cell)){
                    return false;
                }
                else if(cell=='.') continue;
                numbers.add(cell);
            }
        }

        for(int row =0;row<9;row+=3){
            for(int col = 0; col<9 ; col+=3){
                Set<Character> numbers = new HashSet<>();

                for(int i=row;i<row+3;i++){
                    for(int j = col; j<col+3; j++){
                        char cell = board[i][j];
                        if(numbers.contains(cell)){
                            return false;
                        }
                        else if(cell=='.') continue;
                        numbers.add(cell);

                    }
                }
            }
        }



        // if(flag != 0) return false;
        return fact;
    }
}
