class Solution {
    public int mostWordsFound(String[] sentences) {
         int maxWordCount = 0;

        for (int i = 0; i < sentences.length; i++) {
            String words = sentences[i];
            int word_count = 1;

            for (int j = 0; j < words.length(); j++) {
                char ch = words.charAt(j);

                if (Character.isSpaceChar(ch)) {
                    word_count++;
                }

            }
            if (word_count > maxWordCount) {
                maxWordCount = word_count;
            }

        }
        return maxWordCount;
    }
        
    }
