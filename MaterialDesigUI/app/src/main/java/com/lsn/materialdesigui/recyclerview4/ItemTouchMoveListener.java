package com.lsn.materialdesigui.recyclerview4;


public interface ItemTouchMoveListener {

	/**
	 * 当拖拽的时候回调</br>
	 * 可以在此方法里面实现：拖拽条目并实现刷新效果
	 * @param fromPosition 从什么位置拖
	 * @param toPosition	到什么位置
	 * @return 是否执行了move
	 */
	boolean onItemMove(int fromPosition, int toPosition);

	/**
	 * 当条目被移除是回调
	 * @param position 移除的位置
	 * @return
	 */
	boolean onItemRemove(int position);
}
