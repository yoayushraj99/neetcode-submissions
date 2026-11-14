class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();

        for(String str: strs) {
            s.append(str.length()).append("#").append(str);
        }

        return s.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        int n = str.length();
        List<String> res = new ArrayList();

        while(i < n) {

            int delimiterIdx = str.indexOf("#", i);
            int strLen = Integer.parseInt(str.substring(i, delimiterIdx));

            i = delimiterIdx+1;

            res.add(str.substring(i, i+strLen));

            i+= strLen;
        }
        return res;
    }
}
