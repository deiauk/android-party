// Generated by Dagger (https://dagger.dev).
package com.demo.androidparty.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DispatcherModule_Companion_ProvideIODispatcher$app_debugFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return provideIODispatcher$app_debug();
  }

  public static DispatcherModule_Companion_ProvideIODispatcher$app_debugFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher provideIODispatcher$app_debug() {
    return Preconditions.checkNotNull(DispatcherModule.Companion.provideIODispatcher$app_debug(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final DispatcherModule_Companion_ProvideIODispatcher$app_debugFactory INSTANCE = new DispatcherModule_Companion_ProvideIODispatcher$app_debugFactory();
  }
}