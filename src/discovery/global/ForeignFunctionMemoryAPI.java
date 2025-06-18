package discovery.global;//import java.lang.foreign.Arena;
//import java.lang.foreign.MemoryLayout;
//import java.lang.foreign.MemorySegment;
//import java.lang.foreign.ValueLayout;
//import java.lang.invoke.VarHandle;

public class ForeignFunctionMemoryAPI {

    public void test() {
//        int value = 10;
//        MemoryLayout pointLayout = MemoryLayout.structLayout(
//                ValueLayout.JAVA_INT.withName("x"),
//                ValueLayout.JAVA_INT.withName("y")
//        );
//        VarHandle xHandle = pointLayout.varHandle(MemoryLayout.PathElement.groupElement("x"));
//        Arena arena = Arena.ofAuto();
//        MemorySegment segment = arena.allocate(pointLayout);
//        xHandle.set(segment, 0, (int) value);
//        int xValue = (int) xHandle.get(segment, 0);
//
//        System.out.println(value + " equals " + xValue);
    }
}
