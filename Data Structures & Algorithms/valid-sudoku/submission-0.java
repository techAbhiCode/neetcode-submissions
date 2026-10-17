class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;

        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        for(int r = 0; r<N; r++){
            rows[r] = new HashSet<Character>();
            cols[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        for(int r = 0; r<N; r++){
            for(int c = 0; c<N; c++){
                char val = board[r][c];

                //check if the position is filled woth num or not
                if(val == '.'){
                    continue;
                }
                //check for the rows
                if(rows[r].contains(val)){
                    return false;
                }
                rows[r].add(val);

                //check for the cols
                if(cols[c].contains(val)){
                    return false;
                }
                cols[c].add(val);

                //check for the box
                int idx = (r/3) * 3 + (c/3);

                if(boxes[idx].contains(val)){
                    return false;
                }
                boxes[idx].add(val);
            }
        }
        return true;
    }
}
