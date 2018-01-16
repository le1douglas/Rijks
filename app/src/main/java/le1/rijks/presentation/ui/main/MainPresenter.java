package le1.rijks.presentation.ui.main;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import le1.rijks.domain.business.Repo;
import le1.rijks.domain.entities.WorkOfArt;
import le1.rijks.presentation.ui.base.BaseContract;


public class MainPresenter extends AndroidViewModel implements MainContract.ViewModel {
    private static final String TAG = "LE1_MainPresenter";
    private MainContract.View contractView;
    private Repo repo;
    CompositeDisposable cd = new CompositeDisposable();

    public MainPresenter(Application application) {
        super(application);

        repo = new Repo();
        // "SK-A-1505"
    }

    @Override
    public void setContractView(BaseContract.View contractView) {
        this.contractView = (MainContract.View) contractView;
    }

    @Override
    public void loadWorkOfArt() {
        cd.add(repo.getWorkOfArt("SK-A-1505")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<WorkOfArt>() {

                    @Override
                    public void onNext(@io.reactivex.annotations.NonNull WorkOfArt workOfArt) {
                        contractView.onWorkOfArtLoaded(workOfArt);
                    }

                    @Override
                    public void onError(@io.reactivex.annotations.NonNull Throwable e) {
                        contractView.onWorkOfArtLoadingError(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                }));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        cd.dispose();
    }
}
