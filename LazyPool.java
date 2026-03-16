class LazyPool {

    int poolId;
    String poolName;
    int depth;
    int capacity;

    public void getLazyPoolDetail(){

        System.out.println("Lazy Pool Details");
        System.out.println("Pool Id: " + this.poolId);
        System.out.println("Pool Name: " + this.poolName);
        System.out.println("Depth: " + this.depth);
        System.out.println("Capacity: " + this.capacity);

    }
}