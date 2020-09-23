package hr.documents;

/**
 * Created by Ruchira on 9/23/2020.
 */
public class ServiceLicenceAgreement {
    private int minTimeOutPercent;
    private int maxResolutionDays;

    public ServiceLicenceAgreement(int minTimeOutPercent,
                            int maxResolutionDays){
        this.minTimeOutPercent= minTimeOutPercent;
        this.maxResolutionDays=maxResolutionDays;
    }

    public int getMinTimeOutPercent() {
        return minTimeOutPercent;
    }

    public void setMinTimeOutPercent(int minTimeOutPercent) {
        this.minTimeOutPercent = minTimeOutPercent;
    }

    public int getMaxResolutionDays() {
        return maxResolutionDays;
    }

    public void setMaxResolutionDays(int maxResolutionDays) {
        this.maxResolutionDays = maxResolutionDays;
    }
}
