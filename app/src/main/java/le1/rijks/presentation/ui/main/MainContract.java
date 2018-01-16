package le1.rijks.presentation.ui.main;

import le1.rijks.domain.entities.WorkOfArt;
import le1.rijks.presentation.ui.base.BaseContract;

public interface MainContract extends BaseContract {

    interface View extends BaseContract.View {
        void onWorkOfArtLoaded(WorkOfArt workOfArt);
        void onWorkOfArtLoadingError(String message);
    }

    interface ViewModel extends BaseContract.ViewModel {
        @Override
        void setContractView(BaseContract.View contractView);
        void loadWorkOfArt();
    }
}
