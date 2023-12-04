package com.ifriend.base.navigation.api.cicerone;

import java.util.List;
import kotlin.Metadata;
/* compiled from: Navigator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¨\u0006\u000b"}, d2 = {"Lcom/ifriend/base/navigation/api/cicerone/Navigator;", "", "applyCommands", "", "commands", "", "Lcom/ifriend/base/navigation/api/cicerone/Command;", "([Lcom/ifriend/base/navigation/api/cicerone/Command;)V", "getLocalStack", "", "", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Navigator {
    void applyCommands(Command[] commandArr);

    List<String> getLocalStack();
}
