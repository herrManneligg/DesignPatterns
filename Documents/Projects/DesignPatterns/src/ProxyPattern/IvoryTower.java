package ProxyPattern;

public class IvoryTower implements WizardsTower {

	@Override
	public void enter(Wizard wizard) {
		System.out.println(wizard + " enters the tower...");
	}
}
