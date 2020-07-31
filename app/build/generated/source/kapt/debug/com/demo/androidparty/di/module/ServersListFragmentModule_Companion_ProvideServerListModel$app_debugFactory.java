// Generated by Dagger (https://dagger.dev).
package com.demo.androidparty.di.module;

import com.demo.androidparty.network.ApiService;
import com.demo.androidparty.storage.database.ServerDao;
import com.demo.androidparty.storage.preferences.AppPreferences;
import com.demo.androidparty.ui.list.ServerListModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServersListFragmentModule_Companion_ProvideServerListModel$app_debugFactory implements Factory<ServerListModel> {
  private final Provider<CoroutineDispatcher> dispatcherProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<AppPreferences> preferencesProvider;

  private final Provider<ServerDao> daoProvider;

  public ServersListFragmentModule_Companion_ProvideServerListModel$app_debugFactory(
      Provider<CoroutineDispatcher> dispatcherProvider, Provider<ApiService> apiServiceProvider,
      Provider<AppPreferences> preferencesProvider, Provider<ServerDao> daoProvider) {
    this.dispatcherProvider = dispatcherProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.preferencesProvider = preferencesProvider;
    this.daoProvider = daoProvider;
  }

  @Override
  public ServerListModel get() {
    return provideServerListModel$app_debug(dispatcherProvider.get(), apiServiceProvider.get(), preferencesProvider.get(), daoProvider.get());
  }

  public static ServersListFragmentModule_Companion_ProvideServerListModel$app_debugFactory create(
      Provider<CoroutineDispatcher> dispatcherProvider, Provider<ApiService> apiServiceProvider,
      Provider<AppPreferences> preferencesProvider, Provider<ServerDao> daoProvider) {
    return new ServersListFragmentModule_Companion_ProvideServerListModel$app_debugFactory(dispatcherProvider, apiServiceProvider, preferencesProvider, daoProvider);
  }

  public static ServerListModel provideServerListModel$app_debug(CoroutineDispatcher dispatcher,
      ApiService apiService, AppPreferences preferences, ServerDao dao) {
    return Preconditions.checkNotNull(ServersListFragmentModule.Companion.provideServerListModel$app_debug(dispatcher, apiService, preferences, dao), "Cannot return null from a non-@Nullable @Provides method");
  }
}