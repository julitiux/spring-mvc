package mx.com.service;

import org.springframework.stereotype.Service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

@Service
public class NashornServiceImpl implements NashornService {

  private ScriptEngineManager scriptEngineManager;
  private ScriptEngine scriptEngine;

  public NashornServiceImpl() {
    scriptEngineManager = new ScriptEngineManager();
    scriptEngine = scriptEngineManager.getEngineByName("nashorn");
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
  public void callFunctionsWithFile() throws Exception {

  }

  @Override
  public void implementInterface() throws Exception {

  }
}
