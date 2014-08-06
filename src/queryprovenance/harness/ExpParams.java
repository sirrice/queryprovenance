package queryprovenance.harness;

import queryprovenance.query.Table;

public class ExpParams {
	protected static ExpParams _instance = new ExpParams();
	
	public Table table = null;
	public QueryLog qlog = null;
	
	/*
	 * QueryLog generator configs
	 * prefix: ql_
	 */
	public int ql_nqueries = 0;
	public float[] ql_qtypes = null;
	
	/*
	 * Transform selection configs
	 * prefix: tr_
	 */
	
	/*
	 * Solve configs
	 * prefix: s_
	 */
	
	
	
	
	
	private ExpParams() {}
	
	public static ExpParams instance() {
		return _instance;
	}
}