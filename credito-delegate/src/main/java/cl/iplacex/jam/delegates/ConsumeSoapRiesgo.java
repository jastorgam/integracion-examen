package cl.iplacex.jam.delegates;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

import cl.iplacex.jam.credito.wssoap.CalculoRiesgoImpl;
import cl.iplacex.jam.credito.wssoap.CalculoRiesgoImplService;

/**
 * Hello world!
 *
 */
public class ConsumeSoapRiesgo implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        CalculoRiesgoImplService service = new CalculoRiesgoImplService();
        CalculoRiesgoImpl port = service.getCalculoRiesgoImplPort();

        String rut = execution.getVariable("rut", String.class);

        String riesgo = port.calcularRiesgo(rut);

        execution.setVariable("riesgo", riesgo);

        System.out.println(String.format("Riesgo de Rut %s: %s", rut, riesgo));
    }

}
