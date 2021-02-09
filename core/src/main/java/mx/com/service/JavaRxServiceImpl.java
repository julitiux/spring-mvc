package mx.com.service;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

import java.util.ArrayList;
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

  @Override
  public List<String> observableRx(List<String> firstList, List<String> secondList, String string) {
    Observable<String> observable1 = Observable.fromIterable(firstList);
    Observable<String> observable2 = Observable.fromIterable(secondList);

    List<String> returnList = new ArrayList<>();

    Observable.merge(observable1, observable2).subscribe(new Consumer<String>() {
      @Override
      public void accept(String s) throws Exception {
        if(s.contains(string))
          returnList.add(string);
      }
    });

    return returnList;
  }

}
