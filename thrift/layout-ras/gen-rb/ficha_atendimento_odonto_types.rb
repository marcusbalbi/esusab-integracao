#
# Autogenerated by Thrift Compiler (0.9.3)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'common_types'


module Br
  module Gov
    module Saude
      module Esusab
        module Ras
          module Atendodonto
            class ProcedimentoQuantidadeThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              COMSPROCEDIMENTO = 1
              QUANTIDADE = 2

              FIELDS = {
                COMSPROCEDIMENTO => {:type => ::Thrift::Types::STRING, :name => 'coMsProcedimento', :optional => true},
                QUANTIDADE => {:type => ::Thrift::Types::I32, :name => 'quantidade', :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
              end

              ::Thrift::Struct.generate_accessors self
            end

            class FichaAtendimentoOdontologicoChildThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              DTNASCIMENTO = 1
              CNSCIDADAO = 2
              NUMPRONTUARIO = 3
              GESTANTE = 4
              NECESSIDADESESPECIAIS = 5
              LOCALATENDIMENTO = 6
              TIPOATENDIMENTO = 7
              TIPOSENCAMODONTO = 8
              TIPOSFORNECIMODONTO = 9
              TIPOSVIGILANCIASAUDEBUCAL = 10
              TIPOSCONSULTAODONTO = 11
              PROCEDIMENTOSREALIZADOS = 12
              SEXO = 14
              TURNO = 15
              DATAHORAINICIALATENDIMENTO = 16
              DATAHORAFINALATENDIMENTO = 17
              CPFCIDADAO = 18
              MEDICAMENTOS = 19
              ENCAMINHAMENTOS = 20
              RESULTADOSEXAMES = 21

              FIELDS = {
                DTNASCIMENTO => {:type => ::Thrift::Types::I64, :name => 'dtNascimento', :optional => true},
                CNSCIDADAO => {:type => ::Thrift::Types::STRING, :name => 'cnsCidadao', :optional => true},
                NUMPRONTUARIO => {:type => ::Thrift::Types::STRING, :name => 'numProntuario', :optional => true},
                GESTANTE => {:type => ::Thrift::Types::BOOL, :name => 'gestante', :optional => true},
                NECESSIDADESESPECIAIS => {:type => ::Thrift::Types::BOOL, :name => 'necessidadesEspeciais', :optional => true},
                LOCALATENDIMENTO => {:type => ::Thrift::Types::I64, :name => 'localAtendimento', :optional => true},
                TIPOATENDIMENTO => {:type => ::Thrift::Types::I64, :name => 'tipoAtendimento', :optional => true},
                TIPOSENCAMODONTO => {:type => ::Thrift::Types::LIST, :name => 'tiposEncamOdonto', :element => {:type => ::Thrift::Types::I64}, :optional => true},
                TIPOSFORNECIMODONTO => {:type => ::Thrift::Types::LIST, :name => 'tiposFornecimOdonto', :element => {:type => ::Thrift::Types::I64}, :optional => true},
                TIPOSVIGILANCIASAUDEBUCAL => {:type => ::Thrift::Types::LIST, :name => 'tiposVigilanciaSaudeBucal', :element => {:type => ::Thrift::Types::I64}, :optional => true},
                TIPOSCONSULTAODONTO => {:type => ::Thrift::Types::LIST, :name => 'tiposConsultaOdonto', :element => {:type => ::Thrift::Types::I64}, :optional => true},
                PROCEDIMENTOSREALIZADOS => {:type => ::Thrift::Types::LIST, :name => 'procedimentosRealizados', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Br::Gov::Saude::Esusab::Ras::Atendodonto::ProcedimentoQuantidadeThrift}, :optional => true},
                SEXO => {:type => ::Thrift::Types::I64, :name => 'sexo', :optional => true},
                TURNO => {:type => ::Thrift::Types::I64, :name => 'turno', :optional => true},
                DATAHORAINICIALATENDIMENTO => {:type => ::Thrift::Types::I64, :name => 'dataHoraInicialAtendimento', :optional => true},
                DATAHORAFINALATENDIMENTO => {:type => ::Thrift::Types::I64, :name => 'dataHoraFinalAtendimento', :optional => true},
                CPFCIDADAO => {:type => ::Thrift::Types::STRING, :name => 'cpfCidadao', :optional => true},
                MEDICAMENTOS => {:type => ::Thrift::Types::LIST, :name => 'medicamentos', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Br::Gov::Saude::Esusab::Ras::Common::MedicamentoThrift}, :optional => true},
                ENCAMINHAMENTOS => {:type => ::Thrift::Types::LIST, :name => 'encaminhamentos', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Br::Gov::Saude::Esusab::Ras::Common::EncaminhamentoExternoThrift}, :optional => true},
                RESULTADOSEXAMES => {:type => ::Thrift::Types::LIST, :name => 'resultadosExames', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Br::Gov::Saude::Esusab::Ras::Common::ResultadosExameThrift}, :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
              end

              ::Thrift::Struct.generate_accessors self
            end

            class FichaAtendimentoOdontologicoMasterThrift
              include ::Thrift::Struct, ::Thrift::Struct_Union
              UUIDFICHA = 1
              HEADERTRANSPORT = 2
              ATENDIMENTOSODONTOLOGICOS = 3
              TPCDSORIGEM = 4

              FIELDS = {
                UUIDFICHA => {:type => ::Thrift::Types::STRING, :name => 'uuidFicha'},
                HEADERTRANSPORT => {:type => ::Thrift::Types::STRUCT, :name => 'headerTransport', :class => ::Br::Gov::Saude::Esusab::Ras::Common::VariasLotacoesHeaderThrift, :optional => true},
                ATENDIMENTOSODONTOLOGICOS => {:type => ::Thrift::Types::LIST, :name => 'atendimentosOdontologicos', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Br::Gov::Saude::Esusab::Ras::Atendodonto::FichaAtendimentoOdontologicoChildThrift}, :optional => true},
                TPCDSORIGEM => {:type => ::Thrift::Types::I32, :name => 'tpCdsOrigem', :optional => true}
              }

              def struct_fields; FIELDS; end

              def validate
                raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field uuidFicha is unset!') unless @uuidFicha
              end

              ::Thrift::Struct.generate_accessors self
            end

          end
        end
      end
    end
  end
end
