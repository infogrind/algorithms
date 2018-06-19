package ch.hotstuff.algorithms.bst;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BSTTest {

	@Test
	public void emptyTreeTests() {
		BST<Integer> tree = new BST<Integer>();
		assertFalse(tree.contains(3));
		assertEquals("(empty tree)", tree.toString());
	}

	@Test
	public void addingAFewElements() {
		BST<Integer> tree = new BST<Integer>();
		assertFalse(tree.contains(3));
		tree.insert(3);
		assertTrue(tree.contains(3));
		assertEquals("(3, null, null)", tree.toString());
		tree.insert(2);
		assertTrue(tree.contains(2));
		assertEquals("(3, (2, null, null), null)", tree.toString());
		tree.insert(4);
		assertTrue(tree.contains(4));
		assertEquals("(3, (2, null, null), (4, null, null))", tree.toString());
	}
}
