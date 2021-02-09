package mx.com.service;

import org.springframework.stereotype.Service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

@Service
public class NashornServiceImpl implements NashornService {

  private ScriptEngineManager scriptEngineManager;
  private ScriptEngine scriptEngine;

  public NashornServiceImpl() {
    scriptEngineManager = new ScriptEngineManager();
    scriptEngine = scriptEngineManager.getEngineByName("nashorn");
  }

  @Override
  public void callFunctions() throws Exception {
    scriptEngine.eval("print('JS desde Java')");
  }

  @Override
  public void implementInterface() throws Exception {

  }
}
