/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author manishabahranii
 */
public class EnvRewardsWorkRequest extends WorkRequest {
    private String rewards = "$$-Rewards-$$";

    public String getRewards() {
        return rewards;
    }

    public void setRewards(String rewards) {
        this.rewards = rewards;
    }
    
}
