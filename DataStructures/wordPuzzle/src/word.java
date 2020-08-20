/**
 * word
 */
public class word {

    public boolean valid(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        boolean result = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, 0)) {
                    result = true;

                }
            }
        }
        return result;
    }

    public boolean dfs(char[][] board, String word, int i, int j, int k) {
        int m = board.length;
        int n = board[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n) {
            return false;
        }

        if (board[i][j] == word.charAt(k)) {
            char temp = board[i][j];
            board[i][j] = '#';
            if (k == word.length() - 1) {
                return true;
            } else if (dfs(board, word, i - 1, j, k + 1) || dfs(board, word, i + 1, j, k + 1)
                    || dfs(board, word, i, j - 1, k + 1) || dfs(board, word, i, j + 1, k + 1)) {
                return true;
            }
            board[i][j] = temp;
        }

        return false;
    }
}
