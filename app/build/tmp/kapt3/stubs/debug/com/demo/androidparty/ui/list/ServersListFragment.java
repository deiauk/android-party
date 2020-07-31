package com.demo.androidparty.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u001a\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0090D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/demo/androidparty/ui/list/ServersListFragment;", "Lcom/demo/androidparty/BaseFragment;", "()V", "adapter", "Lcom/demo/androidparty/ui/adapter/ServerListAdapter;", "layoutId", "", "getLayoutId$app_debug", "()I", "viewModel", "Lcom/demo/androidparty/ui/list/ServersListViewModel;", "getViewModel$app_debug", "()Lcom/demo/androidparty/ui/list/ServersListViewModel;", "setViewModel$app_debug", "(Lcom/demo/androidparty/ui/list/ServersListViewModel;)V", "handleState", "", "state", "Lcom/demo/androidparty/ui/list/ServerListFetchingState;", "logout", "observeLiveData", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "setViewListeners", "showToast", "message", "", "app_debug"})
public final class ServersListFragment extends com.demo.androidparty.BaseFragment {
    private final int layoutId = com.demo.androidparty.R.layout.servers_list_fragment;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.demo.androidparty.ui.list.ServersListViewModel viewModel;
    private com.demo.androidparty.ui.adapter.ServerListAdapter adapter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutId$app_debug() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.androidparty.ui.list.ServersListViewModel getViewModel$app_debug() {
        return null;
    }
    
    public final void setViewModel$app_debug(@org.jetbrains.annotations.NotNull()
    com.demo.androidparty.ui.list.ServersListViewModel p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setAdapter() {
    }
    
    private final void setViewListeners() {
    }
    
    private final void observeLiveData() {
    }
    
    private final void handleState(com.demo.androidparty.ui.list.ServerListFetchingState state) {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    private final void logout() {
    }
    
    public ServersListFragment() {
        super();
    }
}