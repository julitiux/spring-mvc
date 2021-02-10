package mx.com.service;

import org.springframework.stereotype.Service;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

@Service
public class NashornServiceImpl implements NashornService {

  private ScriptEngineManager scriptEngineManager;
  private ScriptEngine scriptEngine;
  private Invocable invocable;

  public NashornServiceImpl() {
    scriptEngineManager = new ScriptEngineManager();
    scriptEngine = scriptEngineManager.getEngineByName("nashorn");
    invocable = (Invocable)scriptEngine;
  }

  @Override
  public void callFunctionPrint() throws Exception {
    scriptEngine.eval("print('JS desde Java')");
  }

  @Override
  public void callFunctionPrintWithFile() throws Exception {
    scriptEngine.eval(new FileReader("src/main/resources/js/exampleJS.js"));
  }

  @Override
  public Double callFunctionsWithFile() throws Exception {
    scriptEngine.eval(new FileReader("src/main/resources/js/exampleJS.js"));
    return (Double) invocable.invokeFunction("calcular", 10, 30);
  }

  @Override
  public void implementInterface() throws Exception {

  }
}
