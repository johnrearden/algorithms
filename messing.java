class Messing {

    private String[] hashSpace;  
    private Integer bucketCount;

    public Messing(int bucketCount) {
        this.hashSpace = new String[bucketCount]; 
        this.bucketCount = bucketCount;
        String output = "Yo, the bucketCount is currently " + bucketCount + "!";
        System.out.println(output);
    }

    public void put(String key, String value) {
        int hash = key.hashCode();
        Integer wrappedHash = hash;
        Long keyIndex = Integer.toUnsignedLong(wrappedHash);
        hashSpace[keyIndex] = value;

        System.out.println("Placed " + value + " in bucket " + keyIndex);
    }

    public static void main(String[] args) {
        Messing mess = new Messing(65536);
        mess.put("colour", "blue");
    }
}