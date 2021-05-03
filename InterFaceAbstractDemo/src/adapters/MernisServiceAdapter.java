package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(customer.getNationallityId(), customer.getFirstName(),
					customer.getLastName(), customer.getDateOfBrith());
		} catch (RemoteException e) {
			System.out.println("not inValid");
			e.printStackTrace();
		}

		return result;
	}

}
