// Generated by Dagger (https://dagger.dev).
package com.demo.androidparty.di.component;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.ViewModel;
import com.demo.androidparty.AndroidPartyApp;
import com.demo.androidparty.base.ViewModelFactory;
import com.demo.androidparty.di.ActivityBindingModule_ProvideMainActivity;
import com.demo.androidparty.di.MainActivityModule_ProvideLoginFragment$app_debug;
import com.demo.androidparty.di.MainActivityModule_ProvideMainModel$app_debugFactory;
import com.demo.androidparty.di.MainActivityModule_ProvideMainViewModel$app_debugFactory;
import com.demo.androidparty.di.MainActivityModule_ProvideMainViewModelFactory$app_debugFactory;
import com.demo.androidparty.di.MainActivityModule_ProvideServersListFragment$app_debug;
import com.demo.androidparty.di.module.ApiModule_ProvideAuthorisedApiService$app_debugFactory;
import com.demo.androidparty.di.module.ApiModule_ProvideAuthorisedOkHttpClientBuilder$app_debugFactory;
import com.demo.androidparty.di.module.ApiModule_ProvideHttpLoggingInterceptor$app_debugFactory;
import com.demo.androidparty.di.module.ApiModule_ProvideUnauthorisedApiService$app_debugFactory;
import com.demo.androidparty.di.module.ApiModule_ProvideUnauthorisedOkHttpClientBuilderFactory;
import com.demo.androidparty.di.module.AppModule_ProvideApplicationContext$app_debugFactory;
import com.demo.androidparty.di.module.DispatcherModule_ProvideIODispatcher$app_debugFactory;
import com.demo.androidparty.di.module.LoginFragmentModule_ProvideLoginModel$app_debugFactory;
import com.demo.androidparty.di.module.LoginFragmentModule_ProvideLoginViewModel$app_debugFactory;
import com.demo.androidparty.di.module.LoginFragmentModule_ProvideLoginViewModelFactory$app_debugFactory;
import com.demo.androidparty.di.module.ServersListFragmentModule_ProvideServerListModel$app_debugFactory;
import com.demo.androidparty.di.module.ServersListFragmentModule_ProvideServerListViewModel$app_debugFactory;
import com.demo.androidparty.di.module.ServersListFragmentModule_ProvideServerListViewModelFactory$app_debugFactory;
import com.demo.androidparty.di.module.StorageModule_ProvideAndroidPartyDatabase$app_debugFactory;
import com.demo.androidparty.di.module.StorageModule_ProvideAndroidPartyDatabaseDao$app_debugFactory;
import com.demo.androidparty.di.module.StorageModule_ProvideDefaultSharedPreferences$app_debugFactory;
import com.demo.androidparty.di.module.StorageModule_ProvideSharedPreferencesManager$app_debugFactory;
import com.demo.androidparty.network.ApiService;
import com.demo.androidparty.network.interceptor.AuthorizationHeaderInterceptor;
import com.demo.androidparty.network.interceptor.AuthorizationHeaderInterceptor_Factory;
import com.demo.androidparty.storage.database.AndroidPartyDatabase;
import com.demo.androidparty.storage.database.ServerDao;
import com.demo.androidparty.storage.preferences.AppPreferences;
import com.demo.androidparty.ui.list.ServerListModel;
import com.demo.androidparty.ui.list.ServersListFragment;
import com.demo.androidparty.ui.list.ServersListFragment_MembersInjector;
import com.demo.androidparty.ui.list.ServersListViewModel;
import com.demo.androidparty.ui.list.mapper.ServerListMapperImpl_Factory;
import com.demo.androidparty.ui.login.LoginFragment;
import com.demo.androidparty.ui.login.LoginFragment_MembersInjector;
import com.demo.androidparty.ui.login.LoginModel;
import com.demo.androidparty.ui.login.LoginViewModel;
import com.demo.androidparty.ui.main.MainActivity;
import com.demo.androidparty.ui.main.MainActivity_MembersInjector;
import com.demo.androidparty.ui.main.MainModel;
import com.demo.androidparty.ui.main.MainViewModel;
import com.demo.androidparty.utils.InternetStateProviderImpl;
import com.demo.androidparty.utils.InternetStateProviderImpl_Factory;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityBindingModule_ProvideMainActivity.MainActivitySubcomponent.Factory> mainActivitySubcomponentFactoryProvider;

  private Provider<AndroidPartyApp> arg0Provider;

  private Provider<Context> provideApplicationContext$app_debugProvider;

  private Provider<SharedPreferences> provideDefaultSharedPreferences$app_debugProvider;

  private Provider<AppPreferences> provideSharedPreferencesManager$app_debugProvider;

  private Provider<HttpLoggingInterceptor> provideHttpLoggingInterceptor$app_debugProvider;

  private Provider<OkHttpClient> provideUnauthorisedOkHttpClientBuilderProvider;

  private Provider<ApiService> provideUnauthorisedApiService$app_debugProvider;

  private Provider<AuthorizationHeaderInterceptor> authorizationHeaderInterceptorProvider;

  private Provider<OkHttpClient> provideAuthorisedOkHttpClientBuilder$app_debugProvider;

  private Provider<ApiService> provideAuthorisedApiService$app_debugProvider;

  private Provider<AndroidPartyDatabase> provideAndroidPartyDatabase$app_debugProvider;

  private Provider<ServerDao> provideAndroidPartyDatabaseDao$app_debugProvider;

  private DaggerAppComponent(AndroidPartyApp arg0Param) {

    initialize(arg0Param);
  }

  public static AppComponent.Factory factory() {
    return new Factory();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return Collections.<Class<?>, Provider<AndroidInjector.Factory<?>>>singletonMap(MainActivity.class, (Provider) mainActivitySubcomponentFactoryProvider);}

  private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
    return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

  @SuppressWarnings("unchecked")
  private void initialize(final AndroidPartyApp arg0Param) {
    this.mainActivitySubcomponentFactoryProvider = new Provider<ActivityBindingModule_ProvideMainActivity.MainActivitySubcomponent.Factory>() {
      @Override
      public ActivityBindingModule_ProvideMainActivity.MainActivitySubcomponent.Factory get() {
        return new MainActivitySubcomponentFactory();}
    };
    this.arg0Provider = InstanceFactory.create(arg0Param);
    this.provideApplicationContext$app_debugProvider = AppModule_ProvideApplicationContext$app_debugFactory.create(arg0Provider);
    this.provideDefaultSharedPreferences$app_debugProvider = DoubleCheck.provider(StorageModule_ProvideDefaultSharedPreferences$app_debugFactory.create(provideApplicationContext$app_debugProvider));
    this.provideSharedPreferencesManager$app_debugProvider = DoubleCheck.provider(StorageModule_ProvideSharedPreferencesManager$app_debugFactory.create(provideDefaultSharedPreferences$app_debugProvider));
    this.provideHttpLoggingInterceptor$app_debugProvider = DoubleCheck.provider(ApiModule_ProvideHttpLoggingInterceptor$app_debugFactory.create());
    this.provideUnauthorisedOkHttpClientBuilderProvider = DoubleCheck.provider(ApiModule_ProvideUnauthorisedOkHttpClientBuilderFactory.create(provideHttpLoggingInterceptor$app_debugProvider));
    this.provideUnauthorisedApiService$app_debugProvider = DoubleCheck.provider(ApiModule_ProvideUnauthorisedApiService$app_debugFactory.create(provideUnauthorisedOkHttpClientBuilderProvider));
    this.authorizationHeaderInterceptorProvider = AuthorizationHeaderInterceptor_Factory.create(provideSharedPreferencesManager$app_debugProvider);
    this.provideAuthorisedOkHttpClientBuilder$app_debugProvider = DoubleCheck.provider(ApiModule_ProvideAuthorisedOkHttpClientBuilder$app_debugFactory.create(provideHttpLoggingInterceptor$app_debugProvider, (Provider) authorizationHeaderInterceptorProvider));
    this.provideAuthorisedApiService$app_debugProvider = DoubleCheck.provider(ApiModule_ProvideAuthorisedApiService$app_debugFactory.create(provideAuthorisedOkHttpClientBuilder$app_debugProvider));
    this.provideAndroidPartyDatabase$app_debugProvider = DoubleCheck.provider(StorageModule_ProvideAndroidPartyDatabase$app_debugFactory.create(provideApplicationContext$app_debugProvider));
    this.provideAndroidPartyDatabaseDao$app_debugProvider = DoubleCheck.provider(StorageModule_ProvideAndroidPartyDatabaseDao$app_debugFactory.create(provideAndroidPartyDatabase$app_debugProvider));
  }

  @Override
  public void inject(AndroidPartyApp arg0) {
    injectAndroidPartyApp(arg0);}

  private AndroidPartyApp injectAndroidPartyApp(AndroidPartyApp instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
    return instance;
  }

  private static final class Factory implements AppComponent.Factory {
    @Override
    public AppComponent create(AndroidPartyApp arg0) {
      Preconditions.checkNotNull(arg0);
      return new DaggerAppComponent(arg0);
    }
  }

  private final class MainActivitySubcomponentFactory implements ActivityBindingModule_ProvideMainActivity.MainActivitySubcomponent.Factory {
    @Override
    public ActivityBindingModule_ProvideMainActivity.MainActivitySubcomponent create(
        MainActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new MainActivitySubcomponentImpl(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl implements ActivityBindingModule_ProvideMainActivity.MainActivitySubcomponent {
    private final MainActivity arg0;

    private Provider<MainActivityModule_ProvideLoginFragment$app_debug.LoginFragmentSubcomponent.Factory> loginFragmentSubcomponentFactoryProvider;

    private Provider<MainActivityModule_ProvideServersListFragment$app_debug.ServersListFragmentSubcomponent.Factory> serversListFragmentSubcomponentFactoryProvider;

    private Provider<MainModel> provideMainModel$app_debugProvider;

    private Provider<ViewModel> provideMainViewModelFactory$app_debugProvider;

    private Provider<InternetStateProviderImpl> internetStateProviderImplProvider;

    private MainActivitySubcomponentImpl(MainActivity arg0Param) {
      this.arg0 = arg0Param;
      initialize(arg0Param);
    }

    private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
        ) {
      return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(3).put(MainActivity.class, (Provider) DaggerAppComponent.this.mainActivitySubcomponentFactoryProvider).put(LoginFragment.class, (Provider) loginFragmentSubcomponentFactoryProvider).put(ServersListFragment.class, (Provider) serversListFragmentSubcomponentFactoryProvider).build();}

    private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
      return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

    private Map<Class<? extends ViewModel>, Provider<ViewModel>> getMapOfClassOfAndProviderOfViewModel(
        ) {
      return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(MainViewModel.class, provideMainViewModelFactory$app_debugProvider);}

    private ViewModelFactory getViewModelFactory() {
      return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());}

    private MainViewModel getMainViewModel() {
      return MainActivityModule_ProvideMainViewModel$app_debugFactory.provideMainViewModel$app_debug(arg0, getViewModelFactory());}

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivity arg0Param) {
      this.loginFragmentSubcomponentFactoryProvider = new Provider<MainActivityModule_ProvideLoginFragment$app_debug.LoginFragmentSubcomponent.Factory>() {
        @Override
        public MainActivityModule_ProvideLoginFragment$app_debug.LoginFragmentSubcomponent.Factory get(
            ) {
          return new LoginFragmentSubcomponentFactory();}
      };
      this.serversListFragmentSubcomponentFactoryProvider = new Provider<MainActivityModule_ProvideServersListFragment$app_debug.ServersListFragmentSubcomponent.Factory>() {
        @Override
        public MainActivityModule_ProvideServersListFragment$app_debug.ServersListFragmentSubcomponent.Factory get(
            ) {
          return new ServersListFragmentSubcomponentFactory();}
      };
      this.provideMainModel$app_debugProvider = MainActivityModule_ProvideMainModel$app_debugFactory.create(DaggerAppComponent.this.provideSharedPreferencesManager$app_debugProvider);
      this.provideMainViewModelFactory$app_debugProvider = MainActivityModule_ProvideMainViewModelFactory$app_debugFactory.create(provideMainModel$app_debugProvider);
      this.internetStateProviderImplProvider = InternetStateProviderImpl_Factory.create(DaggerAppComponent.this.provideApplicationContext$app_debugProvider);
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);}

    private MainActivity injectMainActivity(MainActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
      MainActivity_MembersInjector.injectViewModel(instance, getMainViewModel());
      return instance;
    }

    private final class LoginFragmentSubcomponentFactory implements MainActivityModule_ProvideLoginFragment$app_debug.LoginFragmentSubcomponent.Factory {
      @Override
      public MainActivityModule_ProvideLoginFragment$app_debug.LoginFragmentSubcomponent create(
          LoginFragment arg0) {
        Preconditions.checkNotNull(arg0);
        return new LoginFragmentSubcomponentImpl(arg0);
      }
    }

    private final class LoginFragmentSubcomponentImpl implements MainActivityModule_ProvideLoginFragment$app_debug.LoginFragmentSubcomponent {
      private final LoginFragment arg0;

      private Provider<LoginModel> provideLoginModel$app_debugProvider;

      private Provider<ViewModel> provideLoginViewModelFactory$app_debugProvider;

      private LoginFragmentSubcomponentImpl(LoginFragment arg0Param) {
        this.arg0 = arg0Param;
        initialize(arg0Param);
      }

      private Map<Class<? extends ViewModel>, Provider<ViewModel>> getMapOfClassOfAndProviderOfViewModel(
          ) {
        return MapBuilder.<Class<? extends ViewModel>, Provider<ViewModel>>newMapBuilder(2).put(MainViewModel.class, MainActivitySubcomponentImpl.this.provideMainViewModelFactory$app_debugProvider).put(LoginViewModel.class, provideLoginViewModelFactory$app_debugProvider).build();}

      private ViewModelFactory getViewModelFactory() {
        return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());}

      private LoginViewModel getLoginViewModel() {
        return LoginFragmentModule_ProvideLoginViewModel$app_debugFactory.provideLoginViewModel$app_debug(arg0, getViewModelFactory());}

      @SuppressWarnings("unchecked")
      private void initialize(final LoginFragment arg0Param) {
        this.provideLoginModel$app_debugProvider = LoginFragmentModule_ProvideLoginModel$app_debugFactory.create(DispatcherModule_ProvideIODispatcher$app_debugFactory.create(), DaggerAppComponent.this.provideUnauthorisedApiService$app_debugProvider, DaggerAppComponent.this.provideSharedPreferencesManager$app_debugProvider);
        this.provideLoginViewModelFactory$app_debugProvider = LoginFragmentModule_ProvideLoginViewModelFactory$app_debugFactory.create(provideLoginModel$app_debugProvider, (Provider) MainActivitySubcomponentImpl.this.internetStateProviderImplProvider);
      }

      @Override
      public void inject(LoginFragment arg0) {
        injectLoginFragment(arg0);}

      private LoginFragment injectLoginFragment(LoginFragment instance) {
        DaggerFragment_MembersInjector.injectAndroidInjector(instance, MainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfObject());
        LoginFragment_MembersInjector.injectViewModel(instance, getLoginViewModel());
        return instance;
      }
    }

    private final class ServersListFragmentSubcomponentFactory implements MainActivityModule_ProvideServersListFragment$app_debug.ServersListFragmentSubcomponent.Factory {
      @Override
      public MainActivityModule_ProvideServersListFragment$app_debug.ServersListFragmentSubcomponent create(
          ServersListFragment arg0) {
        Preconditions.checkNotNull(arg0);
        return new ServersListFragmentSubcomponentImpl(arg0);
      }
    }

    private final class ServersListFragmentSubcomponentImpl implements MainActivityModule_ProvideServersListFragment$app_debug.ServersListFragmentSubcomponent {
      private final ServersListFragment arg0;

      private Provider<ServerListModel> provideServerListModel$app_debugProvider;

      private Provider<ViewModel> provideServerListViewModelFactory$app_debugProvider;

      private ServersListFragmentSubcomponentImpl(ServersListFragment arg0Param) {
        this.arg0 = arg0Param;
        initialize(arg0Param);
      }

      private Map<Class<? extends ViewModel>, Provider<ViewModel>> getMapOfClassOfAndProviderOfViewModel(
          ) {
        return MapBuilder.<Class<? extends ViewModel>, Provider<ViewModel>>newMapBuilder(2).put(MainViewModel.class, MainActivitySubcomponentImpl.this.provideMainViewModelFactory$app_debugProvider).put(ServersListViewModel.class, provideServerListViewModelFactory$app_debugProvider).build();}

      private ViewModelFactory getViewModelFactory() {
        return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());}

      private ServersListViewModel getServersListViewModel() {
        return ServersListFragmentModule_ProvideServerListViewModel$app_debugFactory.provideServerListViewModel$app_debug(arg0, getViewModelFactory());}

      @SuppressWarnings("unchecked")
      private void initialize(final ServersListFragment arg0Param) {
        this.provideServerListModel$app_debugProvider = ServersListFragmentModule_ProvideServerListModel$app_debugFactory.create(DispatcherModule_ProvideIODispatcher$app_debugFactory.create(), DaggerAppComponent.this.provideAuthorisedApiService$app_debugProvider, DaggerAppComponent.this.provideSharedPreferencesManager$app_debugProvider, DaggerAppComponent.this.provideAndroidPartyDatabaseDao$app_debugProvider);
        this.provideServerListViewModelFactory$app_debugProvider = ServersListFragmentModule_ProvideServerListViewModelFactory$app_debugFactory.create(provideServerListModel$app_debugProvider, (Provider) ServerListMapperImpl_Factory.create(), (Provider) MainActivitySubcomponentImpl.this.internetStateProviderImplProvider);
      }

      @Override
      public void inject(ServersListFragment arg0) {
        injectServersListFragment(arg0);}

      private ServersListFragment injectServersListFragment(ServersListFragment instance) {
        DaggerFragment_MembersInjector.injectAndroidInjector(instance, MainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfObject());
        ServersListFragment_MembersInjector.injectViewModel(instance, getServersListViewModel());
        return instance;
      }
    }
  }
}