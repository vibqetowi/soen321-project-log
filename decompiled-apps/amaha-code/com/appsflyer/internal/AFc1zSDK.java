package com.appsflyer.internal;

import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public interface AFc1zSDK {
    AFb1aSDK AFInAppEventParameterName();

    AFc1uSDK AFInAppEventType();

    PurchaseHandler AFLogger();

    AFb1bSDK AFLogger$LogLevel();

    AFd1gSDK AFVersionDeclaration();

    CreateOneLinkHttpTask afDebugLog();

    AFc1mSDK afErrorLog();

    AFd1bSDK afInfoLog();

    AFd1qSDK afRDLog();

    AFb1qSDK afWarnLog();

    AFa1pSDK getLevel();

    AFe1iSDK init();

    ExecutorService values();
}
