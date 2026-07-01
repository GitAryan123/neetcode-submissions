class Solution {
    public String encode(List<String> strs) {
        if (strs.isEmpty() || strs == null) {
            return "";
        }

        StringBuffer encodedString = new StringBuffer();

        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        if(str.length()==0 || str == null){
            return decoded;
        }

        int index=0;
        while(index<str.length()){
            int delimeterIndex = str.indexOf("#",index);
            int length = Integer.parseInt(str.substring(index,delimeterIndex));
            String currentStr = str.substring(delimeterIndex+1,delimeterIndex+1+length);
            decoded.add(currentStr);
            index = delimeterIndex + length + 1;
        }
        return decoded;
    }
}
