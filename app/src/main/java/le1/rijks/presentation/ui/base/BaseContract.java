package le1.rijks.presentation.ui.base;

public interface BaseContract {
    interface View {
    }

    interface ViewModel<SS extends View>{
        void setContractView(SS contractView);
    }

}
