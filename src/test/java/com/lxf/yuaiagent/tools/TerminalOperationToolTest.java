package com.lxf.yuaiagent.tools;

import com.lxf.yuaiagent.tools.TerminalOperationTool;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class TerminalOperationToolTest {

    @Test
    public void testExecuteTerminalCommand() {
        TerminalOperationTool tool = new TerminalOperationTool();
        String command = "cmd";
        String result = tool.executeTerminalCommand(command);
        assertNotNull(result);
    }
}
