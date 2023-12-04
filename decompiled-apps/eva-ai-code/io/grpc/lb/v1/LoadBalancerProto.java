package io.grpc.lb.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
/* loaded from: classes4.dex */
public final class LoadBalancerProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001egrpc/lb/v1/load_balancer.proto\u0012\ngrpc.lb.v1\u001a\u001egoogle/protobuf/duration.proto\u001a\u001fgoogle/protobuf/timestamp.proto\"¤\u0001\n\u0012LoadBalanceRequest\u0012@\n\u000finitial_request\u0018\u0001 \u0001(\u000b2%.grpc.lb.v1.InitialLoadBalanceRequestH\u0000\u0012/\n\fclient_stats\u0018\u0002 \u0001(\u000b2\u0017.grpc.lb.v1.ClientStatsH\u0000B\u001b\n\u0019load_balance_request_type\")\n\u0019InitialLoadBalanceRequest\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\"D\n\u0013ClientStatsPerToken\u0012\u001a\n\u0012load_balance_token\u0018\u0001 \u0001(\t\u0012\u0011\n\tnum_calls\u0018\u0002 \u0001(\u0003\"¤\u0002\n\u000bClientStats\u0012-\n\ttimestamp\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\u0019\n\u0011num_calls_started\u0018\u0002 \u0001(\u0003\u0012\u001a\n\u0012num_calls_finished\u0018\u0003 \u0001(\u0003\u00125\n-num_calls_finished_with_client_failed_to_send\u0018\u0006 \u0001(\u0003\u0012)\n!num_calls_finished_known_received\u0018\u0007 \u0001(\u0003\u0012A\n\u0018calls_finished_with_drop\u0018\b \u0003(\u000b2\u001f.grpc.lb.v1.ClientStatsPerTokenJ\u0004\b\u0004\u0010\u0005J\u0004\b\u0005\u0010\u0006\"á\u0001\n\u0013LoadBalanceResponse\u0012B\n\u0010initial_response\u0018\u0001 \u0001(\u000b2&.grpc.lb.v1.InitialLoadBalanceResponseH\u0000\u0012-\n\u000bserver_list\u0018\u0002 \u0001(\u000b2\u0016.grpc.lb.v1.ServerListH\u0000\u00129\n\u0011fallback_response\u0018\u0003 \u0001(\u000b2\u001c.grpc.lb.v1.FallbackResponseH\u0000B\u001c\n\u001aload_balance_response_type\"\u0012\n\u0010FallbackResponse\"}\n\u001aInitialLoadBalanceResponse\u0012\u001e\n\u0016load_balancer_delegate\u0018\u0001 \u0001(\t\u0012?\n\u001cclient_stats_report_interval\u0018\u0002 \u0001(\u000b2\u0019.google.protobuf.Duration\"7\n\nServerList\u0012#\n\u0007servers\u0018\u0001 \u0003(\u000b2\u0012.grpc.lb.v1.ServerJ\u0004\b\u0003\u0010\u0004\"Z\n\u0006Server\u0012\u0012\n\nip_address\u0018\u0001 \u0001(\f\u0012\f\n\u0004port\u0018\u0002 \u0001(\u0005\u0012\u001a\n\u0012load_balance_token\u0018\u0003 \u0001(\t\u0012\f\n\u0004drop\u0018\u0004 \u0001(\bJ\u0004\b\u0005\u0010\u00062b\n\fLoadBalancer\u0012R\n\u000bBalanceLoad\u0012\u001e.grpc.lb.v1.LoadBalanceRequest\u001a\u001f.grpc.lb.v1.LoadBalanceResponse(\u00010\u0001BW\n\rio.grpc.lb.v1B\u0011LoadBalancerProtoP\u0001Z1google.golang.org/grpc/balancer/grpclb/grpc_lb_v1b\u0006proto3"}, new Descriptors.FileDescriptor[]{DurationProto.getDescriptor(), TimestampProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_grpc_lb_v1_ClientStatsPerToken_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_lb_v1_ClientStatsPerToken_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_lb_v1_ClientStats_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_lb_v1_ClientStats_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_lb_v1_FallbackResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_lb_v1_FallbackResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_lb_v1_InitialLoadBalanceRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_lb_v1_InitialLoadBalanceRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_lb_v1_InitialLoadBalanceResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_lb_v1_InitialLoadBalanceResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_lb_v1_LoadBalanceRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_lb_v1_LoadBalanceRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_lb_v1_LoadBalanceResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_lb_v1_LoadBalanceResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_lb_v1_ServerList_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_lb_v1_ServerList_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_grpc_lb_v1_Server_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_grpc_lb_v1_Server_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private LoadBalancerProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_grpc_lb_v1_LoadBalanceRequest_descriptor = descriptor2;
        internal_static_grpc_lb_v1_LoadBalanceRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"InitialRequest", "ClientStats", "LoadBalanceRequestType"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_grpc_lb_v1_InitialLoadBalanceRequest_descriptor = descriptor3;
        internal_static_grpc_lb_v1_InitialLoadBalanceRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Name"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_grpc_lb_v1_ClientStatsPerToken_descriptor = descriptor4;
        internal_static_grpc_lb_v1_ClientStatsPerToken_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"LoadBalanceToken", "NumCalls"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_grpc_lb_v1_ClientStats_descriptor = descriptor5;
        internal_static_grpc_lb_v1_ClientStats_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Timestamp", "NumCallsStarted", "NumCallsFinished", "NumCallsFinishedWithClientFailedToSend", "NumCallsFinishedKnownReceived", "CallsFinishedWithDrop"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_grpc_lb_v1_LoadBalanceResponse_descriptor = descriptor6;
        internal_static_grpc_lb_v1_LoadBalanceResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"InitialResponse", "ServerList", "FallbackResponse", "LoadBalanceResponseType"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_grpc_lb_v1_FallbackResponse_descriptor = descriptor7;
        internal_static_grpc_lb_v1_FallbackResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[0]);
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_grpc_lb_v1_InitialLoadBalanceResponse_descriptor = descriptor8;
        internal_static_grpc_lb_v1_InitialLoadBalanceResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"LoadBalancerDelegate", "ClientStatsReportInterval"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_grpc_lb_v1_ServerList_descriptor = descriptor9;
        internal_static_grpc_lb_v1_ServerList_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Servers"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_grpc_lb_v1_Server_descriptor = descriptor10;
        internal_static_grpc_lb_v1_Server_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"IpAddress", "Port", "LoadBalanceToken", "Drop"});
        DurationProto.getDescriptor();
        TimestampProto.getDescriptor();
    }
}
