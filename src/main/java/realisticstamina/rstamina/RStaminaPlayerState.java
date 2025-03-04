package realisticstamina.rstamina;

public class RStaminaPlayerState {
    public int testplayerdata = 200;

    public double stamina = RStaminaMod.config.totalStamina;
    public double maxStamina = RStaminaMod.config.totalStamina;
    public double gainedStamina = 0.0;
    public double totalStamina = RStaminaMod.config.totalStamina + gainedStamina;
    public double energy = 100.0;
    public double usedEnergy = 0.0;
    public double energyFromResting = 0.0;
    public boolean edited = false;

    public int staminaRegenCooldown = 0;
    public int miningFatigueCooldown = 0;  // Cooldown before removing mining fatigue effect
    public int exhaustionRestTimer = 0;     // Timer for required rest when exhausted
    public boolean isExhausted = false;     // Whether player is in exhaustion state

    // Speed multiplier based on max stamina
    public double speedMultiplier = 1.0;

    //rates
    public double staminaLossRate = RStaminaMod.config.staminaLossRate;
    public double staminaGainRate = RStaminaMod.config.staminaGainRate;

    public double energyLossRate = RStaminaMod.config.energyLossRate;
    public double energyGainRate = RStaminaMod.config.restingEnergyGainTick;

    public boolean wasOnGround = true;
}
