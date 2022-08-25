class BirdWatcher {
    private final int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    public int[] getLastWeek() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
        return this.birdsPerDay;
    }
    public int getToday() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
        int n = this.birdsPerDay.length-1;
        if(n==-1){
            return 0;
        }
        return this.birdsPerDay[n];
    }
    public void incrementTodaysCount() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
        int n = this.birdsPerDay.length-1;
        this.birdsPerDay[n]+=1;
    }
    public boolean hasDayWithoutBirds() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
        for(int i=0;i<this.birdsPerDay.length;i++){
            if(this.birdsPerDay[i]==0){
                return true;
            }
        }
        return false;
    }
    public int getCountForFirstDays(int numberOfDays) {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
        int sum=0;
        if(numberOfDays<=this.birdsPerDay.length-1){
            for(int i=0;i<numberOfDays;i++){
                sum+=this.birdsPerDay[i];
            }
        }
        else{
            for(int i=0;i<this.birdsPerDay.length;i++){
                sum+=this.birdsPerDay[i];
            }
        }

        return sum;
    }
    public int getBusyDays() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
        int sum=0;
        for(int i=0;i<this.birdsPerDay.length;i++){
            if(this.birdsPerDay[i]>=5){
                sum+=1;
            }
        }
        return sum;
    }
}

