package br.eb.mil.sgl.emailsender.enums;

public enum TicketStatus {

	OPEN("ABERTO"), CLOSED("FECHADO"), CANCELED("CANCELADO"), CONFIRMED("CONFIRMADO"), ON_HOLD("EM ESPERA"),
	IN_PROGRESS("EM ANDAMENTO"), SLA_STOPPED("SLA INTERROMPIDO"), APPROVED("APROVADO"),
	WAITING_FOR_APPROVAL("AGUARDANDO APROVAÇÃO"), REJECTED("REJEITADO"), WAITING_FOR_CLOSURE("AGUARDANDO FECHAMENTO"),
	WAITING_FOR_GUIDE_PRINT("AGUARDANDO RECOLHIMENTO DA GUIA"),
	WAITING_FOR_MATERIAL_REPLACEMENT("AGUARDANDO SUBSTITUIÇÃO"),
	WAITING_FOR_MOVEMENT_START("AGUARDANDO INÍCIO DE TRÂNSITO"), WAITING_FOR_REPAIR_END("AGUARDANDO FIM DO REPARO"),
	WAITING_FOR_REPAIR_START("AGUARDANDO FIM DO TRANSPORTE"),
	WAITING_FOR_MATERIAL_ON_OM("AGUARDANDO ENTRADA DE PATRIMÔNIO NA OM"), FAILURE_NOT_FOUND("FALHA NÃO ENCONTRADA"),
	MAINTENANCE_MATERIAL_AVAILABLE_ON_OM("PATRIMÔNIO DISPONÍVEL NA OM"),
	MAINTENANCE_MATERIAL_IN_MOVEMENT("PATRIMÔNIO EM TRÂNSITO PARA OM"),
	MAINTENANCE_WAITING_FOR_GUIDE_PRINT("AGUARDANDO GUIA"),
	NON_LAI_REPLACEMENT_MATERIAL_AVAILABLE_ON_OM("PATRIMÔNIO DISPONÍVEL NA OM (PATRIMÔNIO NÃO-LAI)"),
	NON_LAI_REPLACEMENT_MATERIAL_IN_MOVEMENT("PATRIMÔNIO EM TRÂNSITO PARA OM (PATRIMÔNIO NÃO-LAI)"),
	NON_LAI_REPLACEMENT_WAITING_FOR_GUIDE_PRINT("AGUARDANDO GUIA (PATRIMÔNIO NÃO-LAI)");

	private final String description;
	
	TicketStatus(String status) {
		this.description = status;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public static String getDescriptionByName(String name) {
        for (TicketStatus status : TicketStatus.values()) {
            if (status.name().equalsIgnoreCase(name)) {
                return status.getDescription();
            }
        }
        throw new IllegalArgumentException("Status desconhecido: " + name);
    }
}
