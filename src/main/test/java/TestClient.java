import com.web.entity.ClientEntity;
import com.web.entity.DeviceEntity;
import com.web.service.ClientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by cnhhdn on 2016/6/24.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestClient extends UnitTestBase {
    public TestClient() {
        super("classpath:spring-hibernate.xml");
    }

    @Test
    public void test() throws Exception {
        ClientService clientService = super.getBean("clientServiceImpl");
        ClientEntity client = clientService.getbyId(10000);
        System.out.println(client.getIdCard());
        ClientEntity client1 = new ClientEntity();
        client1.setIdCard("33333333333");
        client1.setAddTime(new Date());
        //clientService.add(client1);
        // List<ClientEntity> clientList=clientService.getAll();
        /*for (ClientEntity aClientList : clientList) {
            System.out.println(aClientList.toString());
        }*/
        client.setAddTime(new Date());
        clientService.update(client);
        //clientService.delete(clientService.getbyId(10000));

        List<DeviceEntity> devicelist = clientService.getDevicebyId(10000);
        System.out.println(devicelist.get(0).getRepairId());

    }
}
