package MyFrames;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreateBillTest {
	
	CreateBill x;

	@BeforeEach
	void setUp() throws Exception {
		x = new CreateBill();
	}

	@Test
	void testshowdate() {
		Calender cal = Calender.getInstance();
		assertEquals(x.testshowdate(cal.getTime()) );
	}

}
