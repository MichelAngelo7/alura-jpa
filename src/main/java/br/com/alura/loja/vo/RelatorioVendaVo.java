package br.com.alura.loja.vo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RelatorioVendaVo {
	private String nomeProduto;
	private BigDecimal quantidadeVendida;
	private LocalDate dataUltimaVenda;

	public RelatorioVendaVo(String nomeProduto, BigDecimal quantidadeVendida, LocalDate dataUltimaVenda) {
		this.nomeProduto = nomeProduto;
		this.quantidadeVendida = quantidadeVendida;
		this.dataUltimaVenda = dataUltimaVenda;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public BigDecimal getQuantidadeVendida() {
		return quantidadeVendida;
	}

	public LocalDate getDataUltimaVenda() {
		return dataUltimaVenda;
	}

	@Override
	public String toString() {
		return "RelatorioVendaVo [nomeProduto=" + nomeProduto + ", quantidadeVendida=" + quantidadeVendida
				+ ", dataUltimaVenda=" + dataUltimaVenda + "]";
	}

	
}
