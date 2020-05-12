package ProxyPattern;

public class WizardProxyTower {
	
//	  private static final Logger LOGGER = LoggerFactory.getLogger(WizardTowerProxy.class);

	  private static final int NUM_WIZARDS_ALLOWED = 3;
	  private int numWizards;
	  private final WizardsTower tower;

	  public WizardProxyTower(WizardsTower tower) {
	    this.tower = tower;
	  }

	  public void enter(Wizard wizard) {
	    if (numWizards < NUM_WIZARDS_ALLOWED) {
	      tower.enter(wizard);
	      numWizards++;
	    } else {
//	      LOGGER.info("{} is not allowed to enter!", wizard);
	    	System.out.println("You shall not pass, " + wizard + "!");
	    }
	  }
	  
	  
	  // MAIN METHOD
	  public static void main(String[] args) {
		  var proxy = new WizardProxyTower(new IvoryTower());
		  proxy.enter(new Wizard("Red wizard")); // Red wizard enters the tower.
		  proxy.enter(new Wizard("White wizard")); // White wizard enters the tower.
		  proxy.enter(new Wizard("Black wizard")); // Black wizard enters the tower.
		  proxy.enter(new Wizard("Green wizard")); // Green wizard is not allowed to enter!
		  proxy.enter(new Wizard("Brown wizard")); // Brown wizard is not allowed to enter!
	  }
}
