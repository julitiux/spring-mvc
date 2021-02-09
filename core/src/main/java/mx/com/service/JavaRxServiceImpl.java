package mx.com.service;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

import java.util.List;

public class JavaRxServiceImpl implements JavaRxService {

  @Override
  public void observableRx(List<String> list) {
    Observable<String> observable = Observable.fromIterable(list);

    observable.subscribe(new Consumer<String>() {
      @Override
      public void accept(String s) throws Exception {
        System.out.println(s);
      }
    });

  }

}
