// Generated by Dagger (https://dagger.dev).
package com.demo.androidparty.di.module;

import com.demo.androidparty.network.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_Companion_ProvideUnauthorisedApiService$app_debugFactory implements Factory<ApiService> {
  private final Provider<OkHttpClient> clientProvider;

  public ApiModule_Companion_ProvideUnauthorisedApiService$app_debugFactory(
      Provider<OkHttpClient> clientProvider) {
    this.clientProvider = clientProvider;
  }

  @Override
  public ApiService get() {
    return provideUnauthorisedApiService$app_debug(clientProvider.get());
  }

  public static ApiModule_Companion_ProvideUnauthorisedApiService$app_debugFactory create(
      Provider<OkHttpClient> clientProvider) {
    return new ApiModule_Companion_ProvideUnauthorisedApiService$app_debugFactory(clientProvider);
  }

  public static ApiService provideUnauthorisedApiService$app_debug(OkHttpClient client) {
    return Preconditions.checkNotNull(ApiModule.Companion.provideUnauthorisedApiService$app_debug(client), "Cannot return null from a non-@Nullable @Provides method");
  }
}