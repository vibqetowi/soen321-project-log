package com.google.rpc;

import com.google.protobuf.MessageOrBuilder;
import com.google.rpc.Help;
import java.util.List;
/* loaded from: classes6.dex */
public interface HelpOrBuilder extends MessageOrBuilder {
    Help.Link getLinks(int i);

    int getLinksCount();

    List<Help.Link> getLinksList();

    Help.LinkOrBuilder getLinksOrBuilder(int i);

    List<? extends Help.LinkOrBuilder> getLinksOrBuilderList();
}
